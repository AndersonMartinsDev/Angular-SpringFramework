import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { NzFormatEmitEvent } from 'ng-zorro-antd';

@Component({
  selector: 'app-perfil-manter',
  templateUrl: './perfil-manter.component.html',
  styleUrls: ['./perfil-manter.component.scss']
})
export class PerfilManterComponent implements OnInit {
  form: FormGroup;

  constructor(private fb: FormBuilder) { }

  ngOnInit() {
    this.form = this.fb.group({
      permissao: [, Validators.required]
    });

  }
  defaultCheckedKeys = ['0-0-0'];
  defaultSelectedKeys = ['0-0-0'];
  defaultExpandedKeys = ['0-0', '0-0-0', '0-0-1'];

  nodes = [
    {
      title: 'Segurança',
      key: '0-0',
      expanded: true,
      children: [
        {
          title: 'Usuário',
          key: '0-0-0',
          children: [
            { title: 'Manter', key: '0-0-0-0', isLeaf: true },
            { title: 'Visualizar', key: '0-0-0-1', isLeaf: true },
            { title: 'Listar', key: '0-0-0-2', isLeaf: true }
          ]
        },
        {
          title: 'Perfil',
          key: '0-0-1',
          children: [
            { title: 'Manter', key: '0-0-1-0', isLeaf: true },
            { title: 'Visualizar', key: '0-0-1-1', isLeaf: true },
            { title: 'Listar', key: '0-0-1-2', isLeaf: true }
          ]
        },
      ]
    },
  ];

  nzEvent(event: NzFormatEmitEvent): void {
    console.log(event);
  }
}
