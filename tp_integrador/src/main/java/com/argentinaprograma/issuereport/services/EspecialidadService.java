package com.argentinaprograma.issuereport.services;

import com.argentinaprograma.issuereport.model.Especialidad;
import com.argentinaprograma.issuereport.repository.EspecialidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.argentinaprograma.issuereport.services.EspecialidadService;


import java.util.List;

@Service
public class EspecialidadService {
    EspecialidadRepository especialidadRepository;
    @Autowired
    public EspecialidadService(EspecialidadRepository especialidadRepository){
        this.especialidadRepository = especialidadRepository;
    }

    public Especialidad guardar(Especialidad especialidad){
        return especialidadRepository.save(especialidad);
    }

    public List<Especialidad> buscarTodos(){
        return especialidadRepository.findAll();
    }

    public void eliminarPorId(int id){
        especialidadRepository.deleteById(id);
    }

    public void eliminarTodos(){
        especialidadRepository.deleteAll();
    }

    public String[] getListaNOmbresEspecialidades (){
        List<Especialidad> especialidades = buscarTodos();
        String[] listaNombresEspecialidades = new String[especialidades.size()];

        especialidades.forEach(especialidad -> {
            listaNombresEspecialidades[especialidad.getId()] = especialidad.getNombre();
        });
        return listaNombresEspecialidades;
    }

    public Especialidad buscarPorId(int id){
        return especialidadRepository.findById(id).orElse(null);
    }
}
