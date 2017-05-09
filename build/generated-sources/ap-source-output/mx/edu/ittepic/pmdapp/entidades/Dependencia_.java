package mx.edu.ittepic.pmdapp.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.edu.ittepic.pmdapp.entidades.Actividad;
import mx.edu.ittepic.pmdapp.entidades.Administracion;
import mx.edu.ittepic.pmdapp.entidades.Categoriaplan;
import mx.edu.ittepic.pmdapp.entidades.Departamento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-08T21:11:29")
@StaticMetamodel(Dependencia.class)
public class Dependencia_ { 

    public static volatile SingularAttribute<Dependencia, String> clavedepe;
    public static volatile ListAttribute<Dependencia, Departamento> departamentoList;
    public static volatile ListAttribute<Dependencia, Actividad> actividadList;
    public static volatile ListAttribute<Dependencia, Categoriaplan> categoriaplanList;
    public static volatile ListAttribute<Dependencia, Administracion> administracionList;
    public static volatile SingularAttribute<Dependencia, String> nombredepe;
    public static volatile SingularAttribute<Dependencia, Integer> iddepe;

}