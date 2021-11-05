package application;

import java.io.IOException;
import java.util.*;

public class CourseDBStructure implements CourseDBStructureInterface {

	int size;
	LinkedList<CourseDBElement> hashTable[];


	public CourseDBStructure(int s) {

		size = s;
		hashTable = new LinkedList[size];
	}


	public CourseDBStructure(String n, int s) {
		size = s;
		hashTable = new LinkedList[size];
	}

	@Override
	public void add(CourseDBElement e) {
		int i = e.hashCode() % size;
		if(hashTable[i] == null) {
			hashTable[i] = new LinkedList<CourseDBElement>();
		}

		hashTable[i].add(e);
	}

	@Override
	public CourseDBElement get(int crn) throws IOException {

		String s = crn + "";
		int index = s.hashCode() % size;

		if(hashTable[index] == null) {
			throw new IOException();
		}
		else {

			for(int i = 0; i < size; i++) {
				CourseDBElement x = hashTable[index].get(i);
				if(x.getCRN() == crn) {
					return x;
				}
			}

			return null;
		}
	}

	public int getTableSize() {

		return size;
	}

}