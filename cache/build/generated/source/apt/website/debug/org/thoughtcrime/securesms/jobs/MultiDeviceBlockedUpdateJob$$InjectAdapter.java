// Code generated by dagger-compiler.  Do not edit.
package org.thoughtcrime.securesms.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

/**
 * A {@code Binding<MultiDeviceBlockedUpdateJob>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code MultiDeviceBlockedUpdateJob} and its
 * dependencies.
 *
 * Being a {@code Provider<MultiDeviceBlockedUpdateJob>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<MultiDeviceBlockedUpdateJob>} and handling injection
 * of annotated fields.
 */
public final class MultiDeviceBlockedUpdateJob$$InjectAdapter extends Binding<MultiDeviceBlockedUpdateJob>
    implements MembersInjector<MultiDeviceBlockedUpdateJob> {
  private Binding<org.thoughtcrime.securesms.dependencies.SignalCommunicationModule.SignalMessageSenderFactory> messageSenderFactory;
  private Binding<MasterSecretJob> supertype;

  public MultiDeviceBlockedUpdateJob$$InjectAdapter() {
    super(null, "members/org.thoughtcrime.securesms.jobs.MultiDeviceBlockedUpdateJob", NOT_SINGLETON, MultiDeviceBlockedUpdateJob.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    messageSenderFactory = (Binding<org.thoughtcrime.securesms.dependencies.SignalCommunicationModule.SignalMessageSenderFactory>) linker.requestBinding("org.thoughtcrime.securesms.dependencies.SignalCommunicationModule$SignalMessageSenderFactory", MultiDeviceBlockedUpdateJob.class, getClass().getClassLoader());
    supertype = (Binding<MasterSecretJob>) linker.requestBinding("members/org.thoughtcrime.securesms.jobs.MasterSecretJob", MultiDeviceBlockedUpdateJob.class, getClass().getClassLoader(), false, true);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(messageSenderFactory);
    injectMembersBindings.add(supertype);
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<MultiDeviceBlockedUpdateJob>}.
   */
  @Override
  public void injectMembers(MultiDeviceBlockedUpdateJob object) {
    object.messageSenderFactory = messageSenderFactory.get();
    supertype.injectMembers(object);
  }

}