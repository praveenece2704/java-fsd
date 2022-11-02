package com.emp.payroll;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.emp.payroll.model.Admin;
import com.emp.payroll.model.Attendance;
import com.emp.payroll.model.Employee;
import com.emp.payroll.model.Leave;
import com.emp.payroll.model.Salary;
import com.emp.payroll.model.Schedule;
import com.emp.payroll.model.Timesheet;
import com.emp.payroll.repository.AdminRegistrationRepository;
import com.emp.payroll.repository.AttendanceRepository;
import com.emp.payroll.repository.EmpRepository;
import com.emp.payroll.repository.LeaveRepository;
import com.emp.payroll.repository.SalaryRepository;
import com.emp.payroll.repository.ScheduleRepository;
import com.emp.payroll.repository.TimesheetRepository;

@SpringBootTest
public class CompleteJunitTesting {
	
private Logger log=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	AdminRegistrationRepository adminrepo;
	
	@Test
	public void AdminTest1()
	{
		Admin a =adminrepo.findByEmailId("praveen@gmail.com");
		log.info("select a from Admin a is -> {}",a);
		assertEquals(10000,a.getId());                  //check the employee id by email Id
	}
	
	@Test
	public void AdminTest2() {
		List<Admin> list = adminrepo.findAll();
		assertNotEquals(0,list.size());
		log.info("Number of admins -> {}",list.size());//check the number of admins in the table

	}
	
	@Test
	public void AdminTest3()
	{
		Admin a =new Admin();
		a.setEmailId("ram@gmail.com");
		a.setUserName("ram");
		a.setPassword("ramkumar@123");
		adminrepo.save(a);                             //check the data is inserted or not
		Admin b =adminrepo.findByEmailId("ram@gmail.com");
		log.info("User name entered manually -> {}",a.getUserName());
		log.info("User name fetch form the DB ->{}",b.getUserName());
		assertEquals(a.getUserName(),b.getUserName());
	}
	
	@Test
	public void AdminTest4()
	{
		Admin a=adminrepo.findByEmailId("ram@gmail.com");
		a.setPassword("praveen");                       //check the update is working or not
		adminrepo.save(a);
		assertEquals("praveen",adminrepo.findByEmailId("ram@gmail.com").getPassword());
		log.info("select a from Admin a where id= 10001 is -> {}",adminrepo.findByEmailId("ram@mail.com"));
	}
	
	@Test
	public void AdminTest5()
	{
		Admin a=adminrepo.findByEmailId("ram@gmail.com");
		adminrepo.deleteById(a.getId());
		assertFalse(adminrepo.findById(a.getId()).isPresent());
	}
	
	
	@Autowired
	EmpRepository employeerepo;
	
	@Test
	public void EmployeeTest1()
	{
		Employee a =employeerepo.findById(10001).get();
		log.info("select a from Admin a is -> {}",a);
		assertEquals("ram@gmail.com",a.getEmailId());                  //check the employee id by email Id
	}
	
	@Test
	public void EmployeeTest2()
	{
		Employee employee=new Employee();
		employee.setfName("yuva");
		employee.setlName("raj");
		employee.setDob("2010-11-23");
		employee.setGender("male");
		employee.setStreet("123,car street");
		employee.setLocation("Chennai");
		employee.setCity("Chennai");
		employee.setState("Tamil nadu");
		employee.setPincode(636444);
		employee.setMobNo("987654323");
		employee.setEmailId("yuva@gmail.com");
		employee.setPassword("yuvaraj@123");
		employee.setdesignation("Developer");

		employeerepo.save(employee);
		assertEquals("yuva",employeerepo.findByEmailId("yuva@gmail.com").getfName());	
	}
	
	@Test
	public void EmployeeTest3()
	{
		Employee employee=employeerepo.findByEmailId("yuva@gmail.com");
		employee.setfName("remo");
		employee.setlName("raj");
		employee.setDob("2010-10-23");
		employee.setGender("male");
		employee.setStreet("123456,car street");
		employee.setLocation("Madurai");
		employee.setPassword("remooo@123");
		employeerepo.save(employee);
		assertEquals("remo",employeerepo.findByEmailId("yuva@gmail.com").getfName());
		
	}
	
	@Test
	public void EmployeeTest4()
	{
		Employee emp=employeerepo.findByEmailId("yuva@gmail.com");
		employeerepo.deleteById(emp.getEmpId());
		assertFalse(employeerepo.findById(emp.getEmpId()).isPresent());
	}
	
	@Autowired
	AttendanceRepository attendancerepo;
	
	@Test
	public void AttendanceTest1() {
		Optional<Attendance> attendance = attendancerepo.findById(10001L);
		assertEquals("Absent", attendance.get().getStatus());
		
	}
	
	@Test
	public void AttendanceTest2()
	{
		Attendance a=new Attendance();
		a.setEmpId(10010L);
		a.setStatus("present");
		a.setDate("2022-10-26");
		attendancerepo.save(a);
		Attendance b= attendancerepo.findById(10010L).get();
		assertNotNull(b);
		
	}

	
	@Test
	public void AttendanceTest3()
	{
		Attendance attendance = attendancerepo.findById(10010L).get();
		attendance.setStatus("Absent");
		attendancerepo.save(attendance);
		Attendance b= attendancerepo.findById(10010L).get();
		assertEquals("Absent", b.getStatus());
	}

	@Test
	public void AttendanceTest4()
	{
		attendancerepo.deleteById(10010L);
		assertFalse(attendancerepo.findById(10010L).isPresent());
	}
	
	@Autowired
	LeaveRepository leaverepo;
	
	@Test
	public void LeaveTest1() {
		Leave leave = leaverepo.findById(10001L).get();
		assertNotEquals("sick leave", leave.getLeavetype());
	}
	
	@Test
	public void LeaveTest2() {
		Leave leave = new Leave();
		leave.setEmpId(10004L);
		leave.setLeavetype("casual leave");
		leave.setStartdate("2022-10-26");
		leave.setEnddate("2022-10-26");
		leave.setDuration("half day");
		leaverepo.save(leave);
		assertNotNull(leaverepo.findById(10004L).get());

	}
	
	@Test
	public void LeaveTest3() {
		Leave leave = leaverepo.findById(10004L).get();
		leave.setLeavetype("sick leave");
		leaverepo.save(leave);
		assertEquals("sick leave", leaverepo.findById(10004L).get().getLeavetype());
	}
	
	@Test
	public void LeaveTest4() {
		leaverepo.deleteById(10004L);
		assertFalse(leaverepo.findById(10004L).isPresent());
		
	}
	
	@Autowired
	SalaryRepository salaryrepo;

	@Test
	public void SalaryTest1() {
	
     Salary salary = salaryrepo.findById(1).get();
     assertEquals(38800, salary.getNetPay());
	}
	
	@Test
	public void SalaryTest2() {
		Salary s = new Salary();
		s.setEmpId(10004);
		s.setPfAmount(600.00);
		s.setTranDate("2022-10-26");
		s.setBasicPay(20000.00);
		s.setDa(10000.00);
		s.setHra(10000.00);
	    s.setGrossSalary(30000.0);
	    s.setTax(400.00);
	    s.setDeduction(1200.0);
		s.setNetPay(400000.00);
		salaryrepo.save(s);
		assertEquals(10000.00,salaryrepo.findByEmpId(10004).getHra());	
    }
	
	@Test
	public void SalaryTest3()
	{
		Salary s = salaryrepo.findByEmpId(10004);
		s.setBasicPay(30000.0);
		s.setTax(500.0);
		s.setDeduction(1800.0);
		salaryrepo.save(s);
		assertEquals(30000.0, salaryrepo.findByEmpId(10004).getBasicPay());
	}

	
	@Test
	public void SalaryTest4() {
		Salary s=salaryrepo.findByEmpId(10004);
		salaryrepo.deleteById(s.getSalId());
		assertFalse(salaryrepo.findById(s.getSalId()).isPresent());
		
	}
	
	@Autowired
	ScheduleRepository schedulerepo;

	@Test
	public void ScheduleTest1() 
	{
		Schedule schedule = schedulerepo.findById(10001L).get();
		assertEquals("Morning", schedule.getShift());
	}
	
	@Test
	public void ScheduleTest2() {
		Schedule s = new Schedule();
		s.setEmpId(10004L);
		s.setDate("2022-10-26");
		s.setShift("Evening");
		s.setStartingTime("08:00");
		s.setEndTime("17:00");
		s.setDuration("9");		
		schedulerepo.save(s);
		assertNotNull(schedulerepo.findById(10004L).get());	
    }
	
	@Test
	public void ScheduleTest3() {
		Schedule s = schedulerepo.findById(10004L).get();
		s.setShift("Morning");
		schedulerepo.save(s);
		assertEquals("Morning", schedulerepo.findById(10004L).get().getShift());
	}
	
	@Test
	public void ScheduleTest4() {
		schedulerepo.deleteById(10004L);
		assertFalse(schedulerepo.findById(10004L).isPresent());
		
	}
	
	@Autowired
	TimesheetRepository timerepo;
	
	@Test
	public void TimesheetTest1() {
		Timesheet timesheet = timerepo.findById(10001).get();
		assertEquals("1", timesheet.getOvertimeHours());
	}
	
	@Test
	public void TimesheetTest2() {
		Timesheet time = new Timesheet();
		time.setEmpId(10004);
		time.setDate("2022-W43");
		time.setInTime("09:00");
		time.setBreakTime("1");
		time.setOutTime("18:00");
		time.setRegularTime("9");
		time.setOvertimeHours("2");
		time.setTotalHours("11");
		timerepo.save(time);
		assertNotNull(timerepo.findById(10004).get());
	}
	
	@Test
	public void TimesheetTest3() {
		Timesheet a = timerepo.findById(10004).get();
		a.setOvertimeHours("1");
		a.setTotalHours("10");
		timerepo.save(a);
		assertEquals("10", timerepo.findById(10004).get().getTotalHours());
	}
	
	@Test
	public void TimesheetTest4() {
		timerepo.deleteById(10004);
		assertFalse(timerepo.findById(10004).isPresent());
	}

}
