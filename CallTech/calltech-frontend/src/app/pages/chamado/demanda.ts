export interface Chamado {
   natureza: string;
   titulo: string;
}

export interface Demanda {
  descricao: string;
  numeroChamado: number;
  codChamado: number;
  criacao: Date;
  vencimento: Date;
  fechamento: Date;
  chamado: Chamado;
}
