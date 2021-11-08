package it.unibo.oop.lab.nesting2;

import java.lang.annotation.Inherited;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
	
	private List<T> list;
	
	public OneListAcceptable(List<T> list) {
		this.list = list;
	}

	/** {@inheritDoc} */
	@Override
	public Acceptor<T> acceptor() {
		// TODO Auto-generated method stub
		return null;
	}
}
