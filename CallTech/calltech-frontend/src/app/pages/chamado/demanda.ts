export interface Chamado {
   titulo: string;
   numeroChamado: number;
   codChamado: number;
   descricao: string;
}

export interface Demanda {
  natureza: string;
  created: Date;
  vencimento: Date;
  fechamento: Date;
  chamado: Chamado;
  status: string;
}
