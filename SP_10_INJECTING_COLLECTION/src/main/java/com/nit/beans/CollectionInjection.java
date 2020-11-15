package com.nit.beans;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionInjection {

	private List list;
	private Map <String,String> map;
	private Set set;

	public void listIterator() {
		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public void mapIterator() {

		//Iterator it = map.entrySet().iterator();

		//while (it.hasNext()) {
			//System.out.println(map.get(it.next()));
		//}
		
		for(String name : map.values())
		{
		  System.out.println(name);	
		}
		

	}

	public void setIterator() {
		Iterator it = set.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}

}
