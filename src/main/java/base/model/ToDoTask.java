package base.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.*;

@Entity
@Table(name = "todotasks")
public class ToDoTask implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "id")
    private User user_id;

    @JoinColumn(name = "task_date")
    private Date task_date;

    @Column(name = "task_time")
    private Time task_time;

    @Column(name = "task_create_date")
    private Date task_create_date;

    @Column(name = "task", nullable = false)
    private String task;

    @Column(name = "priority", nullable = false)
    private int priority;

    @Column(name = "done", nullable = false)
    private Boolean done;



    protected ToDoTask() {}

    public ToDoTask(User user_id, String task) {
        this.user_id = user_id;
        this.task = task;
    }



    public int getID () { return this.id; }

    public User getUser_id() { return this.user_id; }

    public Date getTask_date(){
        return this.task_date;
    }

    public Time getTask_time() {
        return this.task_time;
    }

    public String getTask() {
        return this.task;
    }

    public int getPriority () { return this.priority; }

    public Boolean getDone () { return this.done; }

    public Date getTask_create_date () { return this.task_create_date; }

    public void setUser_id(User user_id){
        this.user_id = user_id;
    }

    public void setTask_date(Date task_date){
        this.task_date = task_date;
    }

    public void setTask_time(Time task_time){
        this.task_time = task_time;
    }

    public void setTask(String task){
        this.task = task;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public void setDone(Boolean done){
        this.done = done;
    }

    public void setTask_create_date(Date task_create_date){
        this.task_create_date = task_create_date;
    }

}
