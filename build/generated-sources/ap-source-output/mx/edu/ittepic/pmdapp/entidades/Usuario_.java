package mx.edu.ittepic.pmdapp.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.edu.ittepic.pmdapp.entidades.Actividad;
import mx.edu.ittepic.pmdapp.entidades.Empleado;
import mx.edu.ittepic.pmdapp.entidades.Rol;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-08T21:11:29")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile ListAttribute<Usuario, Actividad> actividadList;
    public static volatile SingularAttribute<Usuario, String> usuario;
    public static volatile SingularAttribute<Usuario, String> contrasena;
    public static volatile ListAttribute<Usuario, Rol> rolList;
    public static volatile SingularAttribute<Usuario, Empleado> idemp;
    public static volatile SingularAttribute<Usuario, Integer> idusuario;

}