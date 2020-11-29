/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstudianteManagedBean;

import Tratamiento_Estudiante.TbEstudiante;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author migue
 */
@Stateless
public class TbEstudianteFacade extends AbstractFacade<TbEstudiante> implements TbEstudianteFacadeLocal {

    @PersistenceContext(unitName = "Form_Estudiante_-_RR201803PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbEstudianteFacade() {
        super(TbEstudiante.class);
    }
    
}
