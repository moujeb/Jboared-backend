package jb.service;

import java.util.List;

import jb.model.Conditature;

public interface ConditatureService {

	public void saveConditature(Conditature Conditature);

	void deleteConditature(Long id);

	Conditature updateConditature(Long id);

	List<Conditature> getAllConditature();
}
