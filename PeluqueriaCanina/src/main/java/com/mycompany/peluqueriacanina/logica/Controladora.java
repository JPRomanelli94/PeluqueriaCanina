package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
        
        Duenio duenio = new Duenio();
        duenio.setCelDuenio(celDuenio);
        duenio.setNombre(nombreDuenio);
        
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMasco);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAtencion_especial(atenEsp);
        mascota.setAlergico(alergico);
        mascota.setObservaciones(observaciones);
        mascota.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio,mascota);
        
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void ModificarMascota(Mascota masco, String nombreMasco, String raza, String color, String observaciones, String nombreDuenio, String celDuenio, String alergico, String atenEsp) {
        masco.setNombre(nombreMasco);
        masco.setColor(color);
        masco.setRaza(raza);
        masco.setObservaciones(observaciones);
        masco.setAtencion_especial(atenEsp);
        masco.setAlergico(alergico);
        
        //modifico mascota
        
        controlPersis.modificarMascota(masco);
        
        //seteo los valores del dueño
        Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        dueno.setNombre(nombreDuenio);
        dueno.setCelDuenio(celDuenio);
        
        this.modificarDuenio(dueno);
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }

        
    
    
}
