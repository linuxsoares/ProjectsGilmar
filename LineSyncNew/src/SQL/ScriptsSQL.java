package SQL;

public class ScriptsSQL {

	private String scriptp1 = "select "+ 
			" l.lm_descshort, lpr.lp_sct"; 
	private String scriptp2 = "_ida, lpr.lp_sct";		  
	private String scriptp3 = "_volta "+
			 " from linemt l "+
			  " inner join linedetails ld "+
			   "on l.lm_id = ld.lm_id "+
			   "left outer join transportprovidersxlinemt tp "+
			   "on tp.lm_id = l.lm_id "+
			   "left outer join transportproviders t "+
			   "on t.tp_id = tp.tp_id "+
			   "inner join lineprices lpr "+
			   "on lpr.ld_id = ld.ld_id "+
			   "where (l.lm_regdate > to_date (sysdate - 5) "+
			   "or ld.ld_regdate > to_date (sysdate - 5) "+
			   "or lpr.lp_regdate > to_date (sysdate - 5)) "+
			   "and lpr.lp_status = 'A' "+
			   "and lpr.app_id is null "+
			   "and (lpr.lp_date, lpr.ld_id) in (select max(lp_date), ld_id from lineprices group by ld_id) "+
			   "order by l.lm_id ";

	public String getScriptp2() {
		return scriptp2;
	}

	public void setScriptp2(String scriptp2) {
		this.scriptp2 = scriptp2;
	}

	public String getScriptp3() {
		return scriptp3;
	}

	public void setScriptp3(String scriptp3) {
		this.scriptp3 = scriptp3;
	}

	public String getScript() {
		return scriptp1;
	}

	public void setScript(String script) {
		this.scriptp1 = script;
	}
			   
}
