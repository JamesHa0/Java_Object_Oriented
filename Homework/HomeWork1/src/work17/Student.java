package work17;

public class Student {
    private String id;
    private String sname;
    private String[] hobby;

    public Student(String id, String sname, String[] hobby) {
        this.id = id;
        this.sname = sname;
        this.hobby = hobby;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }else if(obj == null || obj.getClass() != getClass()){
            return false;
        }
        Student sss = (Student) obj;

        if(!this.id.equals(sss.id) || !this.sname.equals(sss.sname)){
            return false;
        }else if(this.hobby.length != sss.hobby.length){
            return false;
        }
        for(String thishobby : this.hobby){
            boolean flag = false;
            for(String ssshobby : sss.hobby){
                if (thishobby.equals(ssshobby)){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                return false;
            }
        }
        return true;
    }
}
