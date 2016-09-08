package com.kingnetdc.dataplatform.service.controller;

import com.kingnetdc.dataplatform.service.model.DependsEntity;
import com.kingnetdc.dataplatform.service.model.TasksEntity;
import com.kingnetdc.dataplatform.service.repository.DependRepository;
import com.kingnetdc.dataplatform.service.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.sql.Timestamp;

/**
 * Created by zhoujiongy on 2016/9/6.
 */
@Controller
public class MainController {

    @Autowired
    TasksRepository tasksRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/admin/tasks", method = RequestMethod.GET)
    public String getTasks(ModelMap modelMap) {
        /* 查询user表中所有记录 */
        List<TasksEntity> tasksList = tasksRepository.findAll();

        // 将所有记录传递给要返回的jsp页面，放在taskList当中
        modelMap.addAttribute("tasksList", tasksList);

        // 返回pages目录下的admin/users.jsp页面
        return "admin/tasks";
    }

    @RequestMapping(value = "/admin/tasks/add", method = RequestMethod.GET)
    public String addTask() {
        return "admin/addTask";
    }

    @RequestMapping(value = "/admin/tasks/addP", method = RequestMethod.POST)
    public String addTaskPost(@ModelAttribute("task") TasksEntity tasksEntity) {
        int maxId=tasksRepository.findMax();
        tasksEntity.setTaskId(maxId + 1);
        tasksEntity.setLastUpdate(new Timestamp(System.currentTimeMillis()));
        tasksRepository.saveAndFlush(tasksEntity);
        return "redirect:/admin/tasks";
    }

    @RequestMapping(value = "/admin/tasks/show/{id}", method = RequestMethod.GET)
    public String showTask(@PathVariable("id") Integer taskId, ModelMap modelMap) {
        TasksEntity tasksEntity = tasksRepository.findOne(taskId);

        modelMap.addAttribute("task", tasksEntity);
        return "admin/taskDetail";
    }

    @RequestMapping(value = "/admin/tasks/update/{id}", method = RequestMethod.GET)
    public  String updateTask(@PathVariable("id") Integer taskId, ModelMap modelMap) {
        TasksEntity tasksEntity = tasksRepository.findOne(taskId);
        modelMap.addAttribute("task", tasksEntity);
        return "admin/updateTask";
    }

    @RequestMapping(value = "/admin/tasks/updateP", method = RequestMethod.POST)
    public String updateTaskPost(@ModelAttribute("taskUpdate") TasksEntity tasksEntity) {
        tasksRepository.updateTask(tasksEntity.getTaskId(), tasksEntity.getName(), tasksEntity.getTitle(), tasksEntity.getGroupId(),
                tasksEntity.getUserId(), tasksEntity.getStartTime(), tasksEntity.getEndTime(), tasksEntity.getSpan(), tasksEntity.getPeriod(),
                tasksEntity.getNextTime(), tasksEntity.getPoolId(), tasksEntity.getDbName(), tasksEntity.getDbType(), tasksEntity.getTableName(),
                tasksEntity.getTableType(), tasksEntity.getDims(), tasksEntity.getIndicators(), tasksEntity.getSqlInitial(), tasksEntity.getStatus(), tasksEntity.getLastUpdate());

        tasksRepository.flush();
        return "redirect:/admin/tasks";

    }
}
