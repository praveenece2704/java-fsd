function Person(first, last, age, eye) {
    this.firstName = first;
    this.lastName = last;
    this.age = age;
    this.eyeColor = eye;
  }
  
  Person.prototype.nationality = "English";

  const myFather = new Person("Praveen","Dhivi",21,"Black");
  console.log(myFather.nationality);