package sample.Client;

public class items {
        private String Serial;
        private String Status;
        private String Type;
        private String Id;
        private String Full_name;
        private String Dep;
        private String Block;
        private String Dorm;
        private String Phonenumber;

        public items (String serial,String status,String type,String id, String full_name,String dep,String block_number,String dorm,String phone){
            this.Serial = serial;
            this.Status = status;
            this.Type = type;
            this.Id = id;
            this.Full_name = full_name;
            this.Block =block_number;
            this.Dorm = dorm;
            this.Phonenumber = phone;
            this.Dep = dep;
        }



    public String getSerial(){
            return Serial;
        }
        public String getStatus(){
            if(Status.equals("1")){
                return "Inside school";
            }
            else if(Status.equals("0")){
                return "Outside school";
            }
            return Status;
        }
        public String getType(){
            return Type;
        }
        public String getId(){
            return Id;
        }
        public String getFull_name(){
            return Full_name;
        }
        public String getBlock(){
            return Block;
        }
        public String getDep(){
        return Dep;
    }
        public String getDorm(){
        return Dorm;
    }
        public String getPhonenumber(){
        return Phonenumber;
    }


}
