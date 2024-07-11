package it.corso.controller;

import java.util.List; 
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import it.corso.dto.UserDto;
import it.corso.dto.UserRegistrationDto;
import it.corso.model.User;
import it.corso.service.UserService;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

// Gestisce tutte le richieste HTTP che hanno http.../User

@Path("/user")
public class IndexController {
	
	// Depedency injection del servizio di User nel controller	
	
	@Autowired
	private UserService userService;
	
	@POST
	@Path("/signup")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response SignupUser(@Valid @RequestBody UserRegistrationDto user) {

		if(!Pattern.matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,20}", user.getPassword()))
			return Response.status(Response.Status.BAD_REQUEST).build();
		
		try {
			
			if(userService.existsUserByEmail(user.getEmail()))
				return Response.status(Response.Status.BAD_REQUEST).build();
			
			userService.addUser(user);
			
			return Response.status(Response.Status.OK).build();
			
		} catch(Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
	}
	
	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserById(@PathParam("id") int id) {
		
		try {

			User user = userService.getUserById(id);
			
			return Response.status(Response.Status.OK).entity(user).build();
			
		} catch(Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
	}
	
	@DELETE
	@Path("/delete/{id}")
	public Response deleteUserById(@PathParam("id") int id) {
		
		try {

			userService.deleteUserById(id);
			
			return Response.status(Response.Status.OK).build();
			
		} catch(Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
	}
	
	@PUT
	@Path("/update")
	public Response updateUserById(@RequestBody User user) {
		
		try {

			userService.updateUser(user);
			
			return Response.status(Response.Status.OK).build();
			
		} catch(Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
	}
	
	@GET
	@Path("/get/all")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllUser() {
		
		try {

			List<UserDto> list = userService.getAllUser();
			
			return Response.status(Response.Status.OK).entity(list).build();
			
		} catch(Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
	}

	/*
	@POST
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response login (@RequestBody UserLoginRequestDto userLoginRequestDto) {
	
		try {
			if (userService.Login (userLoginRequestDto)) {
				// all'interno del metodo ok () viene passato il token
				return Response.ok (issueToken (userLoginRequestDto.getEmail())).build();
			}
		} catch (Exception e) {
			return Response.status (Response.Status. BAD_REQUEST).build();
		}
		return Response.status (Response.Status. BAD_REQUEST).build();
	}
	*/
}
