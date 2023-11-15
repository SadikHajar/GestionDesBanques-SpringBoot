package org.lsi.metier;

import java.util.List;

import org.lsi.entities.Employe;
import org.springframework.data.domain.Page;

public interface EmployeMetier {
	
	public Employe saveEmploye(Employe e);
	public List<Employe> listEmployes();
	public Page<Employe> listEmployes(int page,int size);
	public Employe findByCodeEmploye(Long id);

}
