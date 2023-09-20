package Services;

// @author Haze
import Entities.Armadura;
import Entities.Dispositivo;
import Entities.ObjetoRadar;
import java.util.Scanner;

public class ArmaduraService {

    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Armadura crearArmaduraPred() {
        Dispositivo botas = new Dispositivo(true, 30);
        Dispositivo guantes = new Dispositivo(true, 27);
        Dispositivo consola = new Dispositivo(true, 4);
        Dispositivo sintetizador = new Dispositivo(true, 8);
        return new Armadura("Rojo", "Dorado", botas, guantes, 75, 100, Armadura.getENERGIAMAX(), consola, sintetizador);
    }

    public void caminar(Armadura a, int tiempo) {
        if (!a.getBotas().isDestruido()) {
            if (a.getBotas().estado) {
                float consumo = usarBota(a, tiempo, 1) * 2;
                if (a.getEnergia() >= consumo) {
                    a.setEnergia(a.getEnergia() - consumo);
                }
            } else {
                System.out.println("Las botas se encuentran dañadas y no se puede caminar");
            }
        } else {
            System.out.println("Las botas fueron destruidas y no se puede caminar");
        }
    }

    public void correr(Armadura a, int tiempo) {
        if (!a.getBotas().isDestruido()) {
            if (a.getBotas().estado) {
                float consumo = usarBota(a, tiempo, 2) * 2;
                if (a.getEnergia() >= consumo) {
                    a.setEnergia(a.getEnergia() - consumo);
                }
            } else {
                System.out.println("Las botas se encuentran dañadas y no se puede correr");
            }
        } else {
            System.out.println("Las botas fueron destruidas y no se puede correr");
        }
    }

    public void propulsarse(Armadura a, int tiempo) {
        if (!a.getBotas().isDestruido()) {
            if (a.getBotas().estado) {
                float consumo = usarBota(a, tiempo, 3) * 2;
                if (a.getEnergia() >= consumo) {
                    a.setEnergia(a.getEnergia() - consumo);
                }
            } else {
                System.out.println("Las botas se encuentran dañadas y no puede propulsarse");
            }
        } else {
            System.out.println("Las botas fueron destruidas y no puede propulsarse");
        }
    }

    public void volar(Armadura a, int tiempo) {
        if (!a.getBotas().isDestruido() && !a.getGuantes().isDestruido()) {
            if (a.getBotas().estado && a.getGuantes().estado) {
                float consumo = usarBota(a, tiempo, 3) * 2 + usarGuante(a, tiempo, 2) * 2;
                if (a.getEnergia() >= consumo) {
                    a.setEnergia(a.getEnergia() - consumo);
                }
            } else {
                System.out.println("Las botas o los guantes se encuentran dañados y no se puede volar");
            }
        } else {
            System.out.println("Las botas o los guantes fueron destruidos y no se puede volar");
        }
    }

    public void atacar(Armadura a, int tiempo) {
        if (!a.getGuantes().isDestruido()) {
            if (a.getGuantes().estado) {
                float consumo = usarBota(a, tiempo, 3) * 2;
                if (a.getEnergia() >= consumo) {
                    a.setEnergia(a.getEnergia() - consumo);
                }
            } else {
                System.out.println("Los guantes se encuentran dañados y no se puede atacar");
            }
        } else {
            System.out.println("Los guantes fueron destruidos y no se puede atacar");
        }
    }

    public void escribir(Armadura a, int tiempo) {
        if (!a.getConsola().isDestruido()) {
            if (a.getConsola().estado) {
                float consumo = usarConsola(a, tiempo);
                if (a.getEnergia() >= consumo) {
                    a.setEnergia(a.getEnergia() - consumo);
                }
            } else {
                System.out.println("La consola se encuentra dañada y no se puede escribir");
            }
        } else {
            System.out.println("La consola fue destruida y no se puede escribir");
        }
    }

    public void hablar(Armadura a, int tiempo) {
        if (!a.getSintetizador().isDestruido()) {
            if (a.getSintetizador().estado) {
                float consumo = usarSintetizador(a, tiempo);
                if (a.getEnergia() >= consumo) {
                    a.setEnergia(a.getEnergia() - consumo);
                }
            } else {
                System.out.println("El sintetizador se encuentra dañado y no se puede hablar");
            }
        } else {
            System.out.println("El sintetizador fue destruido y no se puede hablar");
        }
    }

    public float usarBota(Armadura a, int tiempo, int nivelIntensidad) {
        float consumo = 0;
        switch (nivelIntensidad) {
            case 1:
                consumo = 1 * a.getBotas().getConsumoEnergetico() * tiempo;
                break;
            case 2:
                consumo = 2 * a.getBotas().getConsumoEnergetico() * tiempo;
                break;
            case 3:
                consumo = 3 * a.getBotas().getConsumoEnergetico() * tiempo;
                break;
        }
        if (Math.random() <= 0.3) {
            a.getBotas().estado = false;
        }
        return consumo;
    }

    public float usarGuante(Armadura a, int tiempo, int nivelIntensidad) {
        float consumo = 0;
        switch (nivelIntensidad) {
            case 1:
                consumo = 1 * a.getGuantes().getConsumoEnergetico() * tiempo;
                break;
            case 2:
                consumo = 2 * a.getGuantes().getConsumoEnergetico() * tiempo;
                break;
            case 3:
                consumo = 3 * a.getGuantes().getConsumoEnergetico() * tiempo;
                break;
        }
        if (Math.random() <= 0.3) {
            a.getGuantes().estado = false;
        }
        return consumo;
    }

    public float usarConsola(Armadura a, int tiempo) {
        if (Math.random() <= 0.3) {
            a.getConsola().estado = false;
        }
        return a.getConsola().getConsumoEnergetico() * tiempo;
    }

    public float usarSintetizador(Armadura a, int tiempo) {
        if (Math.random() <= 0.3) {
            a.getSintetizador().estado = false;
        }
        return a.getSintetizador().getConsumoEnergetico() * tiempo;
    }

    public float nivelEnergia(Armadura a) {
        float nivEnergia = a.getEnergia() / Armadura.getENERGIAMAX();
        System.out.printf("Nivel de batería: %.1f", (nivEnergia * 100));
        System.out.println("%");
        return nivEnergia;
    }

    public void energiaEnMegaJoules(Armadura a) {
        System.out.println("Energia: " + a.getEnergia() * 3.6 + "MJ");
    }

    public void energiaEnKiloCalorias(Armadura a) {
        System.out.println("Energia: " + a.getEnergia() * 859.85 + "kcal");
    }

    public void repararDispositivo(Dispositivo d) {
        if (d.estado) {
            System.out.println("El dispositivo esta funcional y no necesita ser reparado");
        } else {
            if (Math.random() <= 0.4) {
                System.out.println("Se reparo el dispositivo");
                d.estado = true;
            } else {
                System.out.println("No se reparo el dispositivo");
            }
        }
    }

    public void revisarDispositivos(Armadura a) {
        Dispositivo[] dispositivos = {a.getBotas(), a.getGuantes(), a.getConsola(), a.getSintetizador()};

        for (Dispositivo aux : dispositivos) {
            if (!aux.estado) {
                do {
                    if (Math.random() <= 0.3) {
                        aux.setDestruido(true);
                        System.out.println("El dispositivo fue destruido");
                        break;
                    } else {
                        repararDispositivo(aux);
                    }
                } while (!aux.estado);
            }
        }
    }

    public double distanciaAOjbeto(ObjetoRadar o) {
        return Math.sqrt(Math.pow(o.getCoordenadaX(), 2) + Math.pow(o.getCoordenadaY(), 2) + Math.pow(o.getCoordenadaZ(), 2));
    }

    public void agregarObjetosAlRadar(Armadura a, int cantidad) {
        try {
            for (int i = 0; i < cantidad; i++) {
                if (a.getObjetos()[i] == null) {
                    a.getObjetos()[i] = crearObjeto();
                } else {
                    cantidad++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Intento ingresar mas de 10 objetos, solo se cargaron los primeros 10");
        }

    }

    public ObjetoRadar crearObjeto() {
        ObjetoRadar ob = new ObjetoRadar();
        if (Math.random() <= .5) {
            ob.setHostil(true);
        } else {
            ob.setHostil(false);
        }
        ob.setCoordenadaX((int) (Math.random() * 4000));
        ob.setCoordenadaY((int) (Math.random() * 4000));
        ob.setCoordenadaZ((int) (Math.random() * 4000));
        ob.setResistencia((int) (Math.random() * 300));
        return ob;
    }

    public void destruirObjetos(Armadura a) {
        if (nivelEnergia(a) >= .1) {
            for (int i = 0; i < 10; i++) {
                ObjetoRadar obj = a.getObjetos()[i];
                if (obj != null) {
                    if (obj.isHostil() && distanciaAOjbeto(obj) <= 5000) {
                        do {
                            obj.setResistencia(obj.getResistencia() - (int) (500 - (distanciaAOjbeto(obj) / 10)));
                            atacar(a, 1);
                        } while (obj.getResistencia() > 0 && nivelEnergia(a) >= .1 && a.getGuantes().estado);
                        a.getObjetos()[i] = null;
                    }
                }
            }
        } else {
            ObjetoRadar obj = a.getObjetos()[1];
            if (distanciaAOjbeto(obj) < 10000) {
                double distanciaAViajar = 10000 - (distanciaAOjbeto(obj));
                double tiempoEnSeg = distanciaAViajar / 5000 / 60; //83m/s - 5000mts/min
                System.out.println("Menos de 10% de energia.");
                System.out.println("Se viajo " + tiempoEnSeg + " segundos para estar a mas de 10km de los enemigos");
            }
        }
    }

    public void verObjetos(Armadura a) {
        for (ObjetoRadar aux : a.getObjetos()) {
            System.out.println(aux);
        }
    }

}
