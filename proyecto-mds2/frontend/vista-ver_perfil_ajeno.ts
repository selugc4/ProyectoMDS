import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_perfil_ajeno')
export class VistaVer_perfil_ajeno extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 40%; padding: var(--lumo-space-xl);">
  <img style="width: 25%;" src="https://us.123rf.com/450wm/thesomeday123/thesomeday1231712/thesomeday123171200009/91087331-icono-de-perfil-de-avatar-predeterminado-para-hombre-marcador-de-posici%C3%B3n-de-foto-gris-vector-de-ilu.jpg?ver=6">
  <vaadin-vertical-layout theme="spacing" style="width: 50%; align-self: center;">
   <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start; width: 100%; justify-content: flex-start;">
    <label style="align-self: center; font-size:35px">Nombre del usuario</label>
    <vaadin-horizontal-layout theme="spacing" style="justify-content: flex-end; align-self: center; width: 30%;">
     <vaadin-button>
      Seguir
     </vaadin-button>
     <vaadin-button>
      Dejar de Seguir
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <label>Seguidores: XXXX</label>
   <label>Seguidos: XXXX</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
