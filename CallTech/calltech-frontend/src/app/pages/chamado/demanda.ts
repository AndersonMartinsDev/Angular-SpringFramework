import { Chamado } from 'src/app/util/interface/chamado';

export interface Demanda {
  natureza: string;
  created: Date;
  vencimento: Date;
  fechamento: Date;
  chamado: Chamado;
  status: string;
}
