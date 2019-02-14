package base.info;

import base.model.ToDoTask;
import base.model.User;

import java.sql.Date;
import java.sql.Time;

public class TaskInfo {

    public int id;
    public int user_id;
    public Date task_date;
    public Time task_time;
    public Date task_create_date;
    public String task;
    public int priority;
    public Boolean done;

    private TaskInfo(){}
    public TaskInfo(ToDoTask givenTask){
        id = givenTask.getID();
        User u = givenTask.getUser_id();
        user_id = u.getID();
        task_date = givenTask.getTask_date();
        task_time = givenTask.getTask_time();
        task_create_date = givenTask.getTask_create_date();
        task = givenTask.getTask();
        priority = givenTask.getPriority();
        done = givenTask.getDone();
    }
}
