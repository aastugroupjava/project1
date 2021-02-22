package sample;

public class items {
        private String Request;
        private String Appending;
        private String Approved;
        private String Denied;
        private String Full_name;
        private String Block_number;

        public items (String request,String appending,String approved,String denied, String full_name,String block_number){
            this.Request = request;
            this.Appending = appending;
            this.Approved = approved;
            this.Denied = denied;
            this.Full_name = full_name;
            this.Block_number = block_number;
        }
        public String getRequest(){
            return Request;
        }
        public String getAppending(){
            return Appending;
        }
        public String getApproved(){
            return Approved;
        }
        public String getDenied(){
            return Denied;
        }
        public String getFull_name(){
            return Full_name;
        }
        public String getBlock_number(){
            return Block_number;
        }

}
