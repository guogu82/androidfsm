package cn.ctauto.operate.model;

/**
 * 用户
 * Created by hailong on 2016/6/28.
 */
public class User {
    // {"status":true,"msg":null,"data":{"userid":3,"username":"潘晓刚","pwd":"MTIz","ctime":"2015-03-27 14:56:18","lltime":"2016/7/26 9:37:04","usertype":null,"iusing":1,"type":0,"otherid":-1,"openid":null,"phone":null,
    // "notes":null,"enums":1,"empid":3,"empname":"潘晓刚","ememail":"xiaogang.pan@ctauto.cn","emptel":"","empphone":"13066307074","empgender":1,"cardnum":"","empaddress":"","empbirthday":"1987/4/28","facid":1010,
    // "emptype":"","postid":1,"rankid":5,"entrytime":"2014/7/17","createtime":"2015-03-27 14:56:17","empnation":null,"isusing":1,"university":null,"education":0,"profession":null,"hometown":null,"homeaddress":null,
    // "emergencycontact":null,"ecphone":null,"ifcalc":1,"facadeid":1010,"facname":"凤凰城店","facaddress":"凤凰城","factrapaze":"","facphone":"","postcode":"","ssempname":"潘晓刚","ssempid":3,"depid":114,"factypeid":1,
    // "areaid":6,"fsid":2}}
    private int userid;
    private String username;
    private String pwd;
    private String ctime;
    private String lltime;
    private String usertype;
    private int iusing;
    private int type;
    private int otherid;
    private String openid;
    private String phone;
    private String notes;
    private int enums;
    private String empname;
    private String ememail;
    private String emptel;
    /**
     * 员工电话
     */
    private String empphone;
    private int empgender;
    private String cardnum;
    private String empaddress;
    private String empbirthday;
    /**
     * 门店ID
     */
    private int facid;
    private String emptype;
    private int postid;
    private int rankid;
    private String entrytime;
    private String createtime;
    private String empnation;
    private int isusing;
    private String university;
    private int education;
    private int facadeid;
    /**
     * 门店名称
     */
    private String facname;
    /**
     * 门店地址
     */
    private String facaddress;
    private String factrapaze;
    private String facphone;
    private String postcode;
    private String ssempname;
    private int ssempid;
    private int empid;
    private int depid;
    private int factypeid;
    private int areaid;
    private int fsid;
    private String profession;
    private String hometown;
    private String homeaddress;
    private String emergencycontact;
    private String ecphone;
    /**
     * 是否计算薪资
     */
    private int ifcalc;

    public User() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getLltime() {
        return lltime;
    }

    public void setLltime(String lltime) {
        this.lltime = lltime;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public int getIusing() {
        return iusing;
    }

    public void setIusing(int iusing) {
        this.iusing = iusing;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getOtherid() {
        return otherid;
    }

    public void setOtherid(int otherid) {
        this.otherid = otherid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getEnums() {
        return enums;
    }

    public void setEnums(int enums) {
        this.enums = enums;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmemail() {
        return ememail;
    }

    public void setEmemail(String ememail) {
        this.ememail = ememail;
    }

    public String getEmptel() {
        return emptel;
    }

    public void setEmptel(String emptel) {
        this.emptel = emptel;
    }

    public String getEmpphone() {
        return empphone;
    }

    public void setEmpphone(String empphone) {
        this.empphone = empphone;
    }

    public int getEmpgender() {
        return empgender;
    }

    public void setEmpgender(int empgender) {
        this.empgender = empgender;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }

    public String getEmpaddress() {
        return empaddress;
    }

    public void setEmpaddress(String empaddress) {
        this.empaddress = empaddress;
    }

    public String getEmpbirthday() {
        return empbirthday;
    }

    public void setEmpbirthday(String empbirthday) {
        this.empbirthday = empbirthday;
    }

    public int getFacid() {
        return facid;
    }

    public void setFacid(int facid) {
        this.facid = facid;
    }

    public String getEmptype() {
        return emptype;
    }

    public void setEmptype(String emptype) {
        this.emptype = emptype;
    }

    public int getPostid() {
        return postid;
    }

    public void setPostid(int postid) {
        this.postid = postid;
    }

    public int getRankid() {
        return rankid;
    }

    public void setRankid(int rankid) {
        this.rankid = rankid;
    }

    public String getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getEmpnation() {
        return empnation;
    }

    public void setEmpnation(String empnation) {
        this.empnation = empnation;
    }

    public int getIsusing() {
        return isusing;
    }

    public void setIsusing(int isusing) {
        this.isusing = isusing;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    public int getFacadeid() {
        return facadeid;
    }

    public void setFacadeid(int facadeid) {
        this.facadeid = facadeid;
    }

    public String getFacname() {
        return facname;
    }

    public void setFacname(String facname) {
        this.facname = facname;
    }

    public String getFacaddress() {
        return facaddress;
    }

    public void setFacaddress(String facaddress) {
        this.facaddress = facaddress;
    }

    public String getFactrapaze() {
        return factrapaze;
    }

    public void setFactrapaze(String factrapaze) {
        this.factrapaze = factrapaze;
    }

    public String getFacphone() {
        return facphone;
    }

    public void setFacphone(String facphone) {
        this.facphone = facphone;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getSsempname() {
        return ssempname;
    }

    public void setSsempname(String ssempname) {
        this.ssempname = ssempname;
    }

    public int getSsempid() {
        return ssempid;
    }

    public void setSsempid(int ssempid) {
        this.ssempid = ssempid;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getDepid() {
        return depid;
    }

    public void setDepid(int depid) {
        this.depid = depid;
    }

    public int getFactypeid() {
        return factypeid;
    }

    public void setFactypeid(int factypeid) {
        this.factypeid = factypeid;
    }

    public int getAreaid() {
        return areaid;
    }

    public void setAreaid(int areaid) {
        this.areaid = areaid;
    }

    public int getFsid() {
        return fsid;
    }

    public void setFsid(int fsid) {
        this.fsid = fsid;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

    public String getEmergencycontact() {
        return emergencycontact;
    }

    public void setEmergencycontact(String emergencycontact) {
        this.emergencycontact = emergencycontact;
    }

    public String getEcphone() {
        return ecphone;
    }

    public void setEcphone(String ecphone) {
        this.ecphone = ecphone;
    }

    public int getIfcalc() {
        return ifcalc;
    }

    public void setIfcalc(int ifcalc) {
        this.ifcalc = ifcalc;
    }
}