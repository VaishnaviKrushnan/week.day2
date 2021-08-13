package week1.Day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		//String text = "We learn basics of java as part of java sessions in java week1";

		String[] strText = text.split(" ");
		String duplicate = "";

		for (int i = 0; i < strText.length; i++) {
			int count = 0;
			for (int j = 0; j < strText.length; j++) {
				if (strText[i].equals(strText[j])) {
					count++;
				}
			}
			if (count > 1) {
				if(strText[i]!=" ")
				duplicate=strText[i]+","+duplicate;
				continue;
			}
		}
		String newFormattedtext="";
		String[] aDuplicate = duplicate.split(",");
		for (int j = 0; j < aDuplicate.length; j++) {
			newFormattedtext= text.replace(aDuplicate[j],"");
			text=newFormattedtext;
		}
		System.out.println(newFormattedtext);
	}

}
