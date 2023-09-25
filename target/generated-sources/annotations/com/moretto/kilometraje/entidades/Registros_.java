package com.moretto.kilometraje.entidades;

import com.moretto.kilometraje.entidades.Empleado;
import com.moretto.kilometraje.entidades.Vehiculo;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-20T22:37:08", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Registros.class)
public class Registros_ { 

    public static volatile SingularAttribute<Registros, Empleado> chofer;
    public static volatile SingularAttribute<Registros, Calendar> fechaRegistro;
    public static volatile SingularAttribute<Registros, String> id;
    public static volatile SingularAttribute<Registros, Vehiculo> vehiculo;
    public static volatile SingularAttribute<Registros, Empleado> ayudante;
    public static volatile SingularAttribute<Registros, Double> kmFinalesVehiculo;
    public static volatile SingularAttribute<Registros, Double> kmRecorridos;

}