package it.corso.controller;

import it.corso.jwt.JWTTokenNeeded;
import it.corso.jwt.Secured;

@Secured(role = "Admin")
@JWTTokenNeeded
public class CourseController {

}
