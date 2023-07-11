package tim.exercises.threads;

import java.util.Calendar;
import java.util.Date;

public class Worker {
    protected String name;
    protected String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate, String endDate) throws WorkerExceptions {
        this.name = name;
        if (birthDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
            this.birthDate = birthDate;
        } else {
            throw new WorkerExceptions("Fecha de nacimiento con formato incorrecto, el formato para la creacion de una fecha es dd/mm/yyyy");
        }

        if (endDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
            this.endDate = endDate;
        } else {
            throw new WorkerExceptions("Fecha de termino de contrato con formato incorrecto, el formato para la creacion de una fecha es dd/mm/yyyy");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getAge(){
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int mes = c.get(Calendar.MONTH) + 1;
        String[] fechaArray = this.birthDate.split("/");
        if(Integer.valueOf(fechaArray[1]) > mes) {
            return c.get(Calendar.YEAR) - Integer.valueOf(fechaArray[2]);
        }else{
            if(Integer.valueOf(fechaArray[1]) == mes && Integer.valueOf(fechaArray[0]) <= c.get(Calendar.DAY_OF_MONTH)) {
                return c.get(Calendar.YEAR) - Integer.valueOf(fechaArray[2]);
            } else{
                return c.get(Calendar.YEAR) - Integer.valueOf(fechaArray[2]) -1;
            }
        }
    }

    public static void main(String[] args) {

        Thread newThread = new Thread();
        Thread newOtherThread = new NuevoHilo();
        newOtherThread.setName("el hilo cool");
        newOtherThread.start();

        newThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("excepcion capturada en el thread");
            }
        });
        try {
            Worker newWorker = new Worker("Manuel", "25/01/1985", "10/02/2022");
            System.out.println(newWorker.getAge());

        } catch (WorkerExceptions e){
            System.out.println(e.getMessage());
        }

    }

    private static class NuevoHilo extends Thread {
        @Override
        public void run() {
            System.out.println("Hilo corriendo, nombre: " + this.getName());
        }
    }

    private static class Boveda {
        private int password;

        public Boveda(int password) {
            this.password = password;
        }

        public boolean isThePasswordCorrect(int password) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return this.password == password;
        }
    }

    private static abstract class HackerThread extends Thread {

    }
}
