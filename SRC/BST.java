public class BST extends BinaryTree{
    public Node search(String data){
        Node aux = getRoot();
        while(aux.isLeaf()){
            if(aux.getData().compareTo(data) > 0) aux = aux.getleft();
            else if(aux.getData().compareTo(data) < 0) aux = aux.getRight();
            else return aux; // retorna o elemento buscado.
        }
        return null;
        
    }

    public void insert(String data){
        Node novoNo = new Node(data, null, null, null);
        if(isEmpty()){
            setRoot(novoNo);
        }else{
            Node aux = getRoot();
            while(aux.isLeaf()){
                if(aux.getData().compareTo(novoNo.getData()) > 0) aux = aux.getleft();
                else if(aux.getData().compareTo(novoNo.getData()) < 0) aux = aux.getRight();
                else return; // Ignora a inserção devido a existência de um elemento igual

            }

            novoNo.setParent(aux);                              // aponta pro nó pai

            if(aux.getData().compareTo(novoNo.getData()) > 0){  // Insere na esquerda
                aux.setLeft(novoNo);
            } else {                                            // Insere na direita
                aux.setRight(novoNo);
            }
        }
    }

    public void remove(String data){
        Node aux = search(data);
        if(aux != null){
            aux.getParent().se
        }
    }

    


    public void clear(){this.setRoot(null);}
}
