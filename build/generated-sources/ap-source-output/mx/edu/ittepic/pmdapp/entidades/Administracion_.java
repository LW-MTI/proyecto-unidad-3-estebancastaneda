package mx.edu.ittepic.pmdapp.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.edu.ittepic.pmdapp.entidades.Dependencia;
import mx.edu.ittepic.pmdapp.entidades.Municipio;
import mx.edu.ittepic.pmdapp.entidades.Plan;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-08T21:11:29")
@StaticMetamodel(Administracion.class)
public class Administracion_ { 

    public static volatile ListAttribute<Administracion, Dependencia> dependenciaList;
    public static volatile SingularAttribute<Administracion, Date> fechaini;
    public static volatile SingularAttribute<Administracion, String> claveadmon;
    public static volatile SingularAttribute<Administracion, Integer> idadmon;
    public static volatile SingularAttribute<Administracion, String> nombreadmon;
    public static volatile SingularAttribute<Administracion, Date> fechafin;
    public static volatile ListAttribute<Administracion, Plan> planList;
    public static volatile SingularAttribute<Administracion, Municipio> idmun;

}