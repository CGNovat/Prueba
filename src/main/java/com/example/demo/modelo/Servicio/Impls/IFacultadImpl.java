package com.example.demo.modelo.Servicio.Impls;
//yo estefane modifique la carpeta servicio

import java.util.List;
//modifique la carpeta servicio att tefy
import org.springframework.stereotype.Service;
import com.example.demo.modelo.Dao.FacultadDao;
import com.example.demo.modelo.Entity.Facultad;
import com.example.demo.modelo.Servicio.interfaces.IFacultadService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class IFacultadImpl implements IFacultadService{


    @Override
    public List<Facultad> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void save(Facultad facultad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Facultad findOne(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
