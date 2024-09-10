class ArvoreBinaria{
    public static void main(String[] args) {
        BinaryTree arvore = new BinaryTree(new Node("A", null, null, null));
        arvore.getRoot().setLeft(new Node("B", arvore.getRoot(), null, null));
        arvore.getRoot().getleft().setLeft(new Node("D", arvore.getRoot().getleft(), null, null));
        arvore.getRoot().setRight(new Node("C", arvore.getRoot(), null, null));
        arvore.getRoot().getRight().setLeft(new Node("E", arvore.getRoot().getRight(), null, null));
        arvore.getRoot().getRight().setRight(new Node("F", arvore.getRoot().getRight(), null, null));


        System.out.println("\n-----------------------------------\n");

        // Informações dos nós
        System.out.println("\nInformações dos nós:");

        System.out.println("\n-----------------------------------\n");

        // Informações de A
        System.out.println("O 'A' é raiz: " + arvore.getRoot().isRoot());
        System.out.println("O 'A' é folha: " + arvore.getRoot().isLeaf());
        System.out.println("O grau de 'A' é: " + arvore.getRoot().getDegree());
        System.out.println("O nível de 'A' é: " + arvore.getRoot().getLevel());
        System.out.println("A altura do nó 'A' é: " + arvore.getRoot().getHeight());
        System.out.println();

        System.out.println("\n-----------------------------------\n");

        // Informações de B
        System.out.println("O 'A' é raiz: " + arvore.getRoot().isRoot());
        System.out.println("O 'A' é folha: " + arvore.getRoot().isLeaf());
        System.out.println("O grau de 'A' é: " + arvore.getRoot().getDegree());
        System.out.println("O nível de 'A' é: " + arvore.getRoot().getLevel());
        System.out.println("A altura do nó 'A' é: " + arvore.getRoot().getHeight());
        System.out.println();

        System.out.println("\n-----------------------------------\n");

        // Informações de C
        System.out.println("O 'A' é raiz: " + arvore.getRoot().isRoot());
        System.out.println("O 'A' é folha: " + arvore.getRoot().isLeaf());
        System.out.println("O grau de 'A' é: " + arvore.getRoot().getDegree());
        System.out.println("O nível de 'A' é: " + arvore.getRoot().getLevel());
        System.out.println("A altura do nó 'A' é: " + arvore.getRoot().getHeight());
        System.out.println();

        System.out.println("\n-----------------------------------\n");

        // Informações de D
        System.out.println("O 'A' é raiz: " + arvore.getRoot().isRoot());
        System.out.println("O 'A' é folha: " + arvore.getRoot().isLeaf());
        System.out.println("O grau de 'A' é: " + arvore.getRoot().getDegree());
        System.out.println("O nível de 'A' é: " + arvore.getRoot().getLevel());
        System.out.println("A altura do nó 'A' é: " + arvore.getRoot().getHeight());
        System.out.println();

        System.out.println("\n-----------------------------------\n");

        // Informações de E
        System.out.println("O 'A' é raiz: " + arvore.getRoot().isRoot());
        System.out.println("O 'A' é folha: " + arvore.getRoot().isLeaf());
        System.out.println("O grau de 'A' é: " + arvore.getRoot().getDegree());
        System.out.println("O nível de 'A' é: " + arvore.getRoot().getLevel());
        System.out.println("A altura do nó 'A' é: " + arvore.getRoot().getHeight());
        System.out.println();

        System.out.println("\n-----------------------------------\n");

        // Informações de F
        System.out.println("O 'A' é raiz: " + arvore.getRoot().isRoot());
        System.out.println("O 'A' é folha: " + arvore.getRoot().isLeaf());
        System.out.println("O grau de 'A' é: " + arvore.getRoot().getDegree());
        System.out.println("O nível de 'A' é: " + arvore.getRoot().getLevel());
        System.out.println("A altura do nó 'A' é: " + arvore.getRoot().getHeight());
        System.out.println();

        System.out.println("\n-----------------------------------\n");

        // Informações da arvore
        System.out.println("\nInformações da árvore:");

        System.out.println("\n-----------------------------------\n");
        
        // Se está vazia
        System.out.println("A árvore está vazia: " + arvore.isEmpty());
        System.out.println("\n-----------------------------------\n");
        
        // Grau
        System.out.println("O grau da árvore é: " + arvore.getDegree(arvore.getRoot()));
        System.out.println("\n-----------------------------------\n");
        
        // Altura
        System.out.println("A altura da árvore é de: " + arvore.getHeight());
        System.out.println("\n-----------------------------------\n");
        
        //Percurso em ordem
        System.out.println("Percorrendo de forma em ordem:");
        arvore.inOrderTraversal(arvore.getRoot());
        System.out.println("\n-----------------------------------\n");
        
        //Percurso pré ordem
        System.out.println("Percorrendo de forma pré ordem:");
        arvore.preOrderTraversal(arvore.getRoot());
        System.out.println("\n-----------------------------------\n");
        
        
        //Percurso pós ordem
        System.out.println("Percorrendo de forma pós ordem:");
        arvore.postOrderTraversal(arvore.getRoot());
        System.out.println("\n-----------------------------------\n");
        
        
        // Percorrendo por nível 
        System.out.println("Percorrendo através dos níveis:");
        arvore.levelOrderTraversal();
        System.out.println("\n-----------------------------------\n");


        
    }
}