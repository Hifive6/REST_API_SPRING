package com.win.restexamplehw.assembler;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import com.win.restexamplehw.controller.EmployeeController;
import com.win.restexamplehw.domain.Employee;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class EmployeeModelAssember implements RepresentationModelAssembler<Employee, EntityModel<Employee>>{

    @Override
    public EntityModel<Employee> toModel(Employee employee){
        return EntityModel.of(employee,
        linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
        linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
    }
    
}