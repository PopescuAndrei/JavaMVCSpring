package ro.teamnet.zth.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ro.teamnet.zth.app.domain.Job;
import ro.teamnet.zth.app.domain.Job;
import ro.teamnet.zth.app.service.JobServiceImpl;
import ro.teamnet.zth.app.service.JobServiceImpl;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Andrei on 5/6/2015.
 */
@Controller
@RequestMapping(value="/jobs")
public class JobsController {

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    List<Job> getAllJobs() {
        JobServiceImpl jobService = new JobServiceImpl();
        return jobService.findAllJobs();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{jobId}")
    public
    @ResponseBody
    Job getOneJob(@PathVariable("jobId") int jobId) {
        JobServiceImpl jobService = new JobServiceImpl();
        return jobService.getJob(jobId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{jobId}")
    public void deleteOneJob(@PathVariable("jobId") int jobId) {
        JobServiceImpl jobService = new JobServiceImpl();
        jobService.deleteJob(jobId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    Job insertJob(@RequestBody Job Job) {

        JobServiceImpl jobService = new JobServiceImpl();
        return jobService.insertJob(Job);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody
    Job updateJob(@RequestBody Job Job) {
        JobServiceImpl jobService = new JobServiceImpl();
        return jobService.updateJob(Job);
    }
}
