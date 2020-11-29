/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstudianteManagedBean;

import Tratamiento_Estudiante.TbEstudiante;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author migue
 */
@Named(value = "estudianteJSFManagedBean")
@Dependent
public class EstudianteJSFManagedBean {

    @EJB
    private TbEstudianteFacadeLocal tbEstudianteFacade;
    TbEstudiante estu = new TbEstudiante();
    /**
     * Creates a new instance of EstudianteJSFManagedBean
     */
    public EstudianteJSFManagedBean() {
        
    }

    public TbEstudiante getEstu() {
        return estu;
    }

    public void validar(){
        tbEstudianteFacade.create(estu);
    }
    
    public void modificar(){
        tbEstudianteFacade.edit(estu);
    }
    
    public void suprimir(){
        tbEstudianteFacade.remove(estu);
    }
    
    public void setEstu(TbEstudiante estu) {
        this.estu = estu;
    }
    
    
    
}
