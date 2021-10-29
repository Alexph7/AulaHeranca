package com.alex.aulaheranca;

public class ComissaoEmpregado extends Object {

        private String nome;
        private String sobreNome;
        private String numSeguroSocial;
        private int vendaBruta;
        private double taxaComissao;

        public ComissaoEmpregado(String nome, String sobreNome, String numSeguroSocial, int vendaBruta, double taxaComissao) {

                if (vendaBruta < 0) { //Se Vendas Brutas for invalido, lança uma exceção
                        throw new IllegalArgumentException("Vendas Brutas Deve Ser Maior Que 0");
                }

                if (taxaComissao < 0 && taxaComissao > 1.0) {
                        throw new IllegalArgumentException("Taxa de Comissão deve ser maior que 0");
                }

                this.nome = nome;
                this.sobreNome = sobreNome;
                this.numSeguroSocial = numSeguroSocial;
                this.vendaBruta = vendaBruta;
                this.taxaComissao = taxaComissao;
        }

        public String getNome() {
                return nome;
        }

        public String getSobreNome() {
                return sobreNome;
        }

        public String getNumSeguroSocial() {
                return numSeguroSocial;
        }

        public void setNumSeguroSocial(String numSeguroSocial) {
                this.numSeguroSocial = numSeguroSocial;
        }

        public int getVendaBruta() {
                return vendaBruta;
        }

        public void setVendaBruta(int vendaBruta) {
                  if (vendaBruta < 0) { //Se Vendas Brutas for invalido, lança uma exceção
                        throw new IllegalArgumentException("Vendas Brutas Deve Ser Maior Que 0");
                }
                this.vendaBruta = vendaBruta;
        }

        public double getTaxaComissao() {
                return taxaComissao;
        }

        public void setTaxaComissao(double taxaComissao) {
                 if (taxaComissao < 0 && taxaComissao > 1.0) {
                        throw new IllegalArgumentException("Taxa de Comissão deve ser maior que 0");
                }
                this.taxaComissao = taxaComissao;
        }
        
        public double lucros(){
         return vendaBruta * taxaComissao;       
        }

        @Override
        public String toString() { // significa que esse método substitui um método da superclasse
                return "ComissaoEmpregado{" + "nome=" + nome + ", sobreNome=" + sobreNome + ", numSeguroSocial=" + numSeguroSocial + ", vendaBruta=" + vendaBruta + ", taxaComissao=" + taxaComissao + '}';
        }

        
}