package honux.calandar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlanItem {
	public Date planDate;
	public String detail;
	public String peoples = "";

	public static Date getDateformString(String strDate) {
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public PlanItem(String date, String datail) {
		this.planDate = getDateformString(date);
		this.detail = datail;
	}

	public Date getDate() {
		return planDate;
	}

	public void addPeople(String name) {
		peoples += name + ",";
	}
}
