package tutorial;

import com.google.gson.Gson;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

public class Foo {
    static public void main(String[] args) {

        Test.Person test = Test.Person.newBuilder()
                .setName("illiac")
                .setId(1)
                .setEmail("illiacdev@gmail.com")
                .addPhones(Test.Person.PhoneNumber.newBuilder()
                        .setNumber("010-2561-6502")
                        .setType(Test.Person.PhoneType.T2)
                        .build()
                ).build();


        System.out.println(test);
        byte[] bytes = test.toByteArray();
        System.out.println(bytes.length);

        try {
            String print = JsonFormat.printer().print(test);
            System.out.println(print);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }


        Gson gson = new Gson();


        System.out.println("end!");
    }
}
