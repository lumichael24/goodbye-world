import java.util.LinkedList;

abstract class Animal {
		private int order;
		protected String name;
		public Animal(String name) {
			this.name = name;
		}
		public void setOrder(int order) {
			this.order = order;
		}
		public int getOrder() {
			return this.order;
		}
		public boolean isOlderThan(Animal a) {
			return this.order < a.getOrder();
		}

	}
	class Dog extends Animal {
		public Dog(String name) {
			super(name);
		}
	}
	class Cat extends Animal {
		public Cat(String name) {
			super(name);
		}
	}
	class AnimalQueue {
		LinkedList<Dog> dogs = new LinkedList<Dog>();
		LinkedList<Cat> cats = new LinkedList<Cat>();
		private int size = 0;
		public void enqueue(Animal a) {
			if (a instanceof Dog) {
				dogs.addLast((Dog) a);
				a.setOrder(size);
				
			}
			else {
				cats.addLast((Cat) a);
				a.setOrder(cats.size() - 1);			
			}
			size++;
		}
		public Animal dequeueAny() {
			if (dogs.size() == 0) {
				return cats.poll();
			}
			else if (cats.size() == 0) {
				return dogs.poll();
			}
			if (dogs.peek().isOlderThan(cats.peek())) {
				return dogs.poll();
			}
			else {
				return cats.poll();
			}
		}
		public Animal dequeueDog() {
			return dogs.poll();
		}
		public Animal dequeueCat() {
			return cats.poll();
		}
	}
