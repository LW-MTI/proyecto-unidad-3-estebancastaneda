package mx.edu.ittepic.pmdapp.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.edu.ittepic.pmdapp.entidades.Actividad;
import mx.edu.ittepic.pmdapp.entidades.Categoriaplan;
import mx.edu.ittepic.pmdapp.entidades.Dependencia;
import mx.edu.ittepic.pmdapp.entidades.Objetivo;
import mx.edu.ittepic.pmdapp.entidades.Plan;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-08T21:11:29")
@StaticMetamodel(Categoriaplan.class)
public class Categoriaplan_ { 

    public static volatile ListAttribute<Categoriaplan, Dependencia> dependenciaList;
    public static volatile ListAttribute<Categoriaplan, Actividad> actividadList;
    public static volatile ListAttribute<Categoriaplan, Objetivo> objetivoList;
    public static volatile SingularAttribute<Categoriaplan, String> clavecat;
    public static volatile SingularAttribute<Categoriaplan, Plan> idplan;
    public static volatile ListAttribute<Categoriaplan, Categoriaplan> categoriaplanList;
    public static volatile SingularAttribute<Categoriaplan, Integer> nivelcat;
    public static volatile SingularAttribute<Categoriaplan, String> rutacat;
    public static volatile SingularAttribute<Categoriaplan, Integer> ordencat;
    public static volatile SingularAttribute<Categoriaplan, Integer> idcat;
    public static volatile SingularAttribute<Categoriaplan, Categoriaplan> idcatpadre;
    public static volatile SingularAttribute<Categoriaplan, String> nombrecat;

}