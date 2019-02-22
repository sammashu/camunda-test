package com.camunda.test;

import java.io.IOException;
import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * This is an easy adapter implementation 
 * illustrating how a Java Delegate can be used 
 * from within a BPMN 2.0 Service Task.
 */

@Component("logger")
public class LoggerDelegate implements JavaDelegate {
 
  private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());

  @Autowired
  private PropTestConfig propTestConfig;

  private String error;


  public void execute(DelegateExecution execution) throws Exception {

        LOGGER.info("\n\n  ... LoggerDelegate invoked by "
                + "processDefinitionId=" + execution.getProcessDefinitionId()
                + ", activtyId=" + execution.getCurrentActivityId()
                + ", activtyName='" + execution.getCurrentActivityName() + "'"
                + ", processInstanceId=" + execution.getProcessInstanceId()
                + ", businessKey=" + execution.getProcessBusinessKey()
                + ", executionId=" + execution.getId()
                + ", prop=" + propTestConfig.getElement()
                + " \n\n");




  }


}
