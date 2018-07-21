package examen.student.api.controller;

import examen.common.api.controller.ResponseHandler;
import examen.student.application.StudentApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student/")
public class StudentController {
    @Autowired
    StudentApplicationService moduloApplicationService;
    
    @Autowired
    ResponseHandler responseHandler;
    
    @CrossOrigin(origins = "*")				
    @RequestMapping(method = RequestMethod.GET, value = "/searchStudentByType/{typeStudent}")
    public ResponseEntity<Object> findStudentByType(@PathVariable(value="typeStudent") String typeStudent){
        try {            
            return ResponseEntity.ok().body(moduloApplicationService.findStudentByType(typeStudent));
        } catch(IllegalArgumentException ex) {
            return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
        } catch(Exception ex) {
            return this.responseHandler.getAppExceptionResponse();
        }
    }
    
    @CrossOrigin(origins = "*")				
    @RequestMapping(method = RequestMethod.GET, value = "/findAll/")
    public ResponseEntity<Object> findAllStudents(){
        try {            
            return ResponseEntity.ok().body(moduloApplicationService.findAllStudents());
        } catch(IllegalArgumentException ex) {
            return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
        } catch(Exception ex) {
            return this.responseHandler.getAppExceptionResponse();
        }
    }
    
    @CrossOrigin(origins = "*")				
    @RequestMapping(method = RequestMethod.GET, value = "/calculateAmount/{studentId}")
    public ResponseEntity<Object> calculateAmount(@PathVariable(value="studentId") Long studentId){
        try {            
            return ResponseEntity.ok().body(moduloApplicationService.calculateAmount(studentId));
        } catch(IllegalArgumentException ex) {
            return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
        } catch(Exception ex) {
            return this.responseHandler.getAppExceptionResponse();
        }
    }
}
