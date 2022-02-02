package com.uniquindio.springboot.backend.apirest.models.services;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;

public interface IUpoadFileService {

    public Resource cargar(String nombreFoto) throws MalformedURLException;
    public String guardar(MultipartFile archivo) throws IOException;
    public boolean eliminar(String nombreFoto);
    public Path getPath(String nombreFoto);
}