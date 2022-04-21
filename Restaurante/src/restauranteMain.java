
public class restauranteMain {

	public static void main(String[] args) {
		
		
		Entrada e1 = new Entrada(20);
		pilhaPratos p1 = new pilhaPratos(50);
		listaMesas m1 = new listaMesas(1);
		Pagamento pg = new Pagamento(20);	
		e1.inserir(1);
		e1.inserir(1);
		e1.inserir(1);
		e1.inserir(1);
		e1.inserir(1);
		e1.inserir(1);
		e1.inserir(1);
		e1.inserir(1);
		m1.setTotalMesas(25);
		m1.inseririnicio(1);
		m1.inseririnicio(1);
		m1.inseririnicio(1);
		m1.inseririnicio(1);
		m1.inseririnicio(1);
		m1.inseririnicio(1);
		m1.inseririnicio(1);
		m1.inseririnicio(1);
		pg.inserir(120);
		pg.inserir(150);
		pg.inserir(321);
		pg.inserir(50);
		pg.inserir(73);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		p1.push(1);
		System.out.println("tamanho da fila de entrada: "+e1.getTamanho());
		System.out.println("tamanho da fila de pagamento: "+pg.getTamanho());
		System.out.println("quantidade de pessoas almoçando: "+m1.quantPessoas());
		System.out.println("quantidade de pessoas atendidas: "+(m1.quantPessoas()+pg.getTamanho()));
		System.out.println("quantidade de pratos na pilha: "+p1.numeroPratos());
		System.out.println("quatidade de mesas vazias: "+m1.quantMesas());
		
		
	}
}
