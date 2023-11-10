package collection_framework_operations;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcept {
	
	enum Language {
		Java,
		CSHARP,
		JAVASCRIPT,
		PYTHON
		
	}
	
	public static void main(String[] a) {
		
		EnumSet<Language> e =EnumSet.allOf(Language.class);
		System.out.println(e);
		
		EnumSet<Language> e1 =EnumSet.noneOf(Language.class);
		System.out.println(e1);
		
		EnumSet<Language> e2 =EnumSet.range(Language.Java, Language.JAVASCRIPT);
		System.out.println(e2);
		
		EnumSet<Language> e3 =EnumSet.of(Language.Java);
		System.out.println(e3);
		
		EnumSet<Language> e4 =EnumSet.of(Language.Java ,Language.JAVASCRIPT );
		System.out.println(e4);
		
		EnumSet<Language> lang1 =EnumSet.allOf(Language.class);
		EnumSet<Language> lang2 =EnumSet.noneOf(Language.class);
		lang2.add(Language.JAVASCRIPT);
		
		Iterator<Language> itr = lang1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
