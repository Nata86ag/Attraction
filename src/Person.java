public class Person {

        private String name;
        private String surname;
        private int tickets;

        public Person(String name,String surname,int tickets){
            this.name=name;
            this.surname=surname;
            this.tickets=tickets;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return this.name;
        }
        public void  setSurname(String surname){
            this.surname=surname;
        }
        public String getSurname(){
            return this.surname;
        }
        public void setTickets(int tickets){
            if (tickets>0){
            }
            this.tickets=tickets;
        }
        public int getTickets(){
            return this.tickets;
        }
    }

