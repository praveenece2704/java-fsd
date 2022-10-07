import { Component, OnInit } from '@angular/core';
import { TodoDataService } from '../service/data/todo-data.service';

@Component({
  selector: 'app-list-todos',
  templateUrl: './list-todos.component.html',
  styleUrls: ['./list-todos.component.css']
})
export class Todo {
  constructor(
    public id:number,
    public description:string,
    public done:boolean,
    public targetDate:Date
    )
    {

    }
}

export class ListTodosComponent implements OnInit {
  todos: Todo[] |undefined;
  // todo={
  //   id:1,
  //   description:'Learn to expert in Angular'
  // }
  // todos=[
  //   new Todo(1,'Become an expert at Angular',false,new Date()),
  //   new Todo(2,'Learn front end development',false,new Date()),
  //   new Todo(3,'Visit chennai Mphasis office',false,new Date()),
  //   // { id:1,description:'Become an expert at Angular'},
  //   // { id:2,description:'Learn Front end developer'},
  //   // { id:3,description:'Visit Chennai mphasis office'}
  // ]
  
  constructor(private todoService : TodoDataService)
  {}
  

  ngOnInit(): void {
    this.refreshTodos;
  }
  refreshTodos() {
    this.todoService.retrieveAllTodos('praveen').subscribe(
      response => {
        console.log(response);
        this.todos = response;
      }
    )
  }

}

