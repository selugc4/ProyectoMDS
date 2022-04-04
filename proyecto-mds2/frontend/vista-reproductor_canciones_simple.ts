import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-progress-bar/src/vaadin-progress-bar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-reproductor_canciones_simple')
export class VistaReproductor_canciones_simple extends LitElement {
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
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; justify-content: space-between; align-items: center;" id="vaadinHorizontalLayout">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout1">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2">
    <img style="width: 125px; height: 125px;" src="https://upload.wikimedia.org/wikipedia/commons/6/6b/Logo_UAL_Transparente.png" id="img">
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3">
    <label style="font-size: 15pt; height: 100%;" font-size="" id="label">Titulo de canción </label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4">
    <label style="margin-top: var(--lumo-space-xs);" id="label1">xx:xx/xx:xx</label>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; height: 100%; align-items: center; margin-left: var(--lumo-space-xl);" id="vaadinHorizontalLayout5">
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton">
    <iron-icon src="https://cdn.discordapp.com/attachments/689232198712426506/953324245390344312/2413625.png" id="ironIcon"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton1">
    <iron-icon src="https://w7.pngwing.com/pngs/689/324/png-transparent-back-direction-music-play-previous-rounded-song-play-rounded-icon-thumbnail.png" id="ironIcon1"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton2">
    <iron-icon src="https://e7.pngegg.com/pngimages/807/619/png-clipart-number-computer-icons-pausebutton-text-trademark-thumbnail.png" id="ironIcon2"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton3">
    <iron-icon src="https://w7.pngwing.com/pngs/416/711/png-transparent-computer-icons-play-angle-triangle-black.png" id="ironIcon3"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton4">
    <iron-icon src="https://cdn.discordapp.com/attachments/689232198712426506/953326545689260062/descarga.jpg" id="ironIcon4"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton5">
    <iron-icon src="https://cdn.discordapp.com/attachments/689232198712426506/953324531932610630/2413625.png" id="ironIcon5"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; height: 100%; width: 50%;" id="vaadinHorizontalLayout6">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout7">
    <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton6">
     <iron-icon src="https://w7.pngwing.com/pngs/529/205/png-transparent-for-loop-infinite-loop-computer-science-computer-icons-loop-miscellaneous-angle-text-thumbnail.png" id="ironIcon6"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 35px; height: 35px; align-items: center;" id="vaadinHorizontalLayout8">
    <img style="height: 100%;" src="https://e7.pngegg.com/pngimages/518/845/png-clipart-black-volume-icon-computer-icons-volume-sound-icon-sound-miscellaneous-blue.png" id="img1">
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="height: 100%; width: 50%;" id="vaadinHorizontalLayout9">
    <vaadin-progress-bar style="height: 15px; width: 100%;" id="vaadinProgressBar"></vaadin-progress-bar>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="height: 100%; margin-right: var(--lumo-space-xl);" id="vaadinHorizontalLayout10">
   <vaadin-button id="vaadinButton7">
     Ver créditos 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
