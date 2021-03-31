package tests;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import source.BTNode;
import source.LinkedBinaryTree;
import tad_lista_de_nodos.Position;
class LinkedBinaryTreeTest {

	@Test
	void test() {
		LinkedBinaryTree<String> T = criaArvore();
		
		Position<String> raiz = T.root();		
		assertEquals("SD", T.root().element());
		
		assertEquals(true ,T.hasLeft(raiz));
		assertEquals(true ,T.hasRight(raiz));		
		assertEquals("Sistemas", T.left(raiz).element());
		assertEquals("Digitais", T.right(raiz).element());	
		
		Position<String> nao = T.right(raiz);		
		assertEquals(true ,T.hasLeft(nao));
		assertEquals(true ,T.hasRight(nao));		
		assertEquals("Ciencia", T.left(nao).element());
		assertEquals("Computação", T.right(nao).element());
		
		Position<String> nao2 = T.right(nao);		
		assertEquals(true ,T.hasLeft(nao2));
		assertEquals(true ,T.hasRight(nao2));		
		assertEquals("Redes", T.left(nao2).element());
		assertEquals("Estrutura de Dados", T.right(nao2).element());
	}

	public LinkedBinaryTree<String> criaArvore() {
		LinkedBinaryTree<String> T = new LinkedBinaryTree<String>();
		BTNode<String> raiz, a, b;
		
		T.addRoot("SD");
		raiz = (BTNode<String>) T.root();
		T.insertLeft(raiz, "Sistemas");
		a = (BTNode<String>) T.insertRight(raiz, "Digitais");
		
		T.insertLeft(a, "Ciencia");
		b = (BTNode<String>) T.insertRight(a, "Computação");	
		
		T.insertLeft(b, "Redes");
		T.insertRight(b, "Estrutura de Dados");		
		return T;
	}	
}
