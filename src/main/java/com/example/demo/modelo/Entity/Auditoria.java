package com.example.demo.modelo.Entity;

import java.time.LocalDateTime;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass 
@Getter
@Setter
public abstract class Auditoria {
 
@Enumerated(EnumType.STRING)
private Estado estado;

@DateTimeFormat(iso = ISO.DATE)
private LocalDateTime fechaRegistro; 

}
