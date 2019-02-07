package task6;

import task7.CustomAnnotation;

/**
 * Class describes Atomic Boat
 */
@CustomAnnotation(name = "Atomic Boat")
class AtomicBoat {
    private Engine engineLeft;
    private Engine engineRight;

    /**
     * Base constructor. Initialise engines.
     */
    AtomicBoat() {
        engineLeft = new Engine("left");
        engineRight = new Engine("right");
    }

    /**
     * Function to start boat movement. Launch engines.
     */
    void start() {
        engineLeft.start();
        engineRight.start();
    }


    /**
     * Function to stop boat movement. Stop engines.
     */
    void stop() {
        engineLeft.stop();
        engineRight.stop();
    }

    /**
     * Class describes Engine.
     */
    public class Engine {
        private String name;

        /**
         * Base constructor.
         * @param name of engine
         */
        Engine(String name) {
            this.name = name;
        }

        /**
         * Launch engine
         */
        void start() {
            System.out.println("Engine " + name + " started");
        }

        /**
         * Stop engine.
         */
        void stop() {
            System.out.println("Engine " + name + " stoped");
        }
    }
}
