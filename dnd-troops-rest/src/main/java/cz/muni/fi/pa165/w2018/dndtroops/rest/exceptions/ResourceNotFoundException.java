package cz.muni.fi.pa165.w2018.dndtroops.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Lukáš Kurčík <lukas.kurcik@gmail.com>
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "The requested resource was not found")
public class ResourceNotFoundException extends RuntimeException {

} 
